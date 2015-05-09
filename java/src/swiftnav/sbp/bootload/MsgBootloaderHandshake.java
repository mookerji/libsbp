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

package swiftnav.sbp.bootload;

import org.codehaus.preon.annotation.BoundNumber;
import org.codehaus.preon.buffer.ByteOrder;
import swiftnav.sbp.SBP;



  
/** SBP class for message MSG_BOOTLOADER_HANDSHAKE (0x00B0).
 *
 * You can have MSG_BOOTLOADER_HANDSHAKE inherent its fields directly from
 * an inherited SBP object, or construct it inline using a dict of its
 * fields.
 *
  * The handshake message establishes a handshake between the device
 * bootloader and the host.  The payload string contains the
 * bootloader version number, but returns an empty string for
 * earlier versions. */
public class MsgBootloaderHandshake extends SBP {

    public static final int TYPE = 0x00B0;

    public MsgBootloaderHandshake() {
    }

    
    /** * Version number string (not NULL terminated) */
    @BoundString()
    private None handshake;

    

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