package datadonkey.dockerr;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

class JavaClient {

    public static void main(String[] args) throws RserveException, REXPMismatchException {

        System.out.println("Establishing connection to Rserve");
        RConnection connection = new RConnection("127.0.0.1", 6311);
        System.out.println("Defining function");
        connection.eval("multiply=function(a,b){return(a*b)}");
        System.out.println("Calling function");
        REXP result = connection.eval("multiply(4,5)");
        System.out.println("Result: " + result.asDouble());
        connection.close();
    }
}
