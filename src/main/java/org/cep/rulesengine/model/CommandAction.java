package org.cep.rulesengine.model;

import org.cep.rulesengine.Event;
import org.cep.rulesengine.RuleExecutionException;
import org.cep.rulesengine.interpreter.EvaluationContext;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

/**
 * An Action used to execute a script or to run external programs.
 *
 * @author A. Rodriguez
 */
public class CommandAction extends RuleAction {

    public CommandAction(List<String> args) {
        super(args);
    }

    /**
     * Executes the CommandAction.
     */
    public boolean execute(EvaluationContext context, List<Event> args)
            throws RuleExecutionException {
        try {
            FileOutputStream fos = new FileOutputStream(""); // the log
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec(""); // the cmd + arguments to the cmd

            StreamHelper errorHelper = new
                    StreamHelper(proc.getErrorStream(), "Error");

            StreamHelper outputHelper = new
                    StreamHelper(proc.getInputStream(), "Ouput", fos);

            errorHelper.start();
            outputHelper.start();

            int exitVal = proc.waitFor();
            System.out.println("ExitValue: " + exitVal);

            fos.flush();
            fos.close();
        } catch (Throwable t) {
            throw new RuleExecutionException(t.getMessage());
        }
        return true;
    }

    /**
     * A specialized thread for reading from an InputStream.
     */
    private class StreamHelper extends Thread {
        InputStream is;
        String type;
        OutputStream os;

        public StreamHelper(InputStream is, String type) {
            this(is, type, null);
        }

        public StreamHelper(InputStream is, String type, OutputStream redirect) {
            this.is = is;
            this.type = type;
            this.os = redirect;
        }

        public void run() {
            try {
                PrintWriter pw = null;
                if (os != null)
                    pw = new PrintWriter(os);

                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String line = null;
                while ((line = br.readLine()) != null) {
                    if (pw != null)
                        pw.println(line);
                    System.out.println(type + ">" + line);
                }
                if (pw != null)
                    pw.flush();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

}
