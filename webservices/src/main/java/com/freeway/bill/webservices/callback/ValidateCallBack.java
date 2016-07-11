package com.freeway.bill.webservices.callback;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;
import org.springframework.stereotype.Component;

/**
 * WebService安全检查
 * 
 * @author Ajaxfan
 */
@Component("validateCallBack")
public class ValidateCallBack implements CallbackHandler {

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];

        if ("joe".equals(pc.getIdentifier())) {
            pc.setPassword("joespassword");
        }
    }
}
