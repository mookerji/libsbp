/*
 * Copyright (C) 2015 Swift Navigation Inc.
 * Contact: Bhaskar Mookerji <mookerji@swiftnav.com>
 *
 * This source is subject to the license found in the file 'LICENSE' which must
 * be be distributed together with this source. All other rights reserved.
 *
 * THIS CODE AND INFORMATION IS PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND,
 * EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A PARTICULAR PURPOSE.
 */

package swiftnav.sbp.piksi;

import org.codehaus.preon.annotation.BoundNumber;
import org.codehaus.preon.buffer.ByteOrder;
import swiftnav.sbp.SBP;



  
/** SBP class for message MSG_UART_STATE (0x0018).
 *
 * You can have MSG_UART_STATE inherent its fields directly from
 * an inherited SBP object, or construct it inline using a dict of its
 * fields.
 *
  * The UART message reports data latency and throughput of the UART
 * channels providing SBP I/O. On the default Piksi configuration,
 * UARTs A and B are used for telemetry radios, but can also be be
 * host access ports for embedded hosts, or other interfaces in
 * future. The reported percentage values require to be normalized. */
public class MsgUartState extends SBP {

    public static final int TYPE = 0x0018;

    public MsgUartState() {
    }

    
    /** * State of UART A */
    @BoundString()
    private None uart_a;

    
    /** * State of UART B */
    @BoundString()
    private None uart_b;

    
    /** * State of UART FTDI (USB logger) */
    @BoundString()
    private None uart_ftdi;

    
    /** * UART communication latency */
    @BoundString()
    private None latency;

    

    /** Given a binary payload d, update the appropriate payload
     *  fields of the message. */
    public void fromBinary() {

    }

    /** Produce a framed/packed SBP message. */
    public int toBinary() {
        return 0;
    }

    /** Given a JSON-encoded string s, build a message object. */
    public void fromJSON(String s) {

    }

    public void toJSONDict() {
    }

    public String toString() {
        return "Foo!";
    }
}