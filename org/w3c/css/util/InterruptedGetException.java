// InterruptedGetException.java
// $Id$
// (c) COPYRIGHT MIT, INRIA and Keio, 1999.
// Please first read the full copyright statement in file COPYRIGHT.html
 
import java.io.*;

/**
 * Thrown when a HTTP Get is interrupted
 * @version $Revision$
 * @author  Beno�t Mah� (bmahe@w3.org)
 */
public class InterruptedGetException extends IOException {

    public long bytesTransferred = 0;
    public long bytesExpected    = 0;

    public InterruptedGetException(String message) {
	super(message);
    }
    
}
