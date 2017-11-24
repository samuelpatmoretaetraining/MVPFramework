package com.muelpatmore.mvpframework.data.network;

import com.muelpatmore.mvpframework.data.network.service.ConnectionService;
import com.muelpatmore.mvpframework.data.network.service.RequestInterface;

/**
 * Created by Samuel on 24/11/2017.
 */

public class AppAPIHelper implements APIHelper {

    private RequestInterface requestInterface;

    public AppAPIHelper() {
        requestInterface = ConnectionService.getServerConnection();
    }
}
