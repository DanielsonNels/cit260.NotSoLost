/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.notSoLost.exceptions;

/**
 *
 * @author JNewland
 */
public class RaftControlException extends Exception {

    public RaftControlException() {
    }

    public RaftControlException(String message) {
        super(message);
    }

    public RaftControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public RaftControlException(Throwable cause) {
        super(cause);
    }

    public RaftControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
