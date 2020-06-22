package com.ekrmh.airshipnotiftest

import com.huawei.hms.push.HmsMessageService
import com.huawei.hms.push.RemoteMessage
import com.urbanairship.push.hms.AirshipHmsIntegration

class MyHmsMessageService : HmsMessageService() {
    override fun onMessageReceived(message: RemoteMessage) {
        AirshipHmsIntegration.processMessageSync(applicationContext, message);

    }
    override fun onNewToken(token: String) {
        AirshipHmsIntegration.processNewToken(applicationContext);
    }
}