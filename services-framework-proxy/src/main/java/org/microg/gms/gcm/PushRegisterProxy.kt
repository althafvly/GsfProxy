/*
 * SPDX-FileCopyrightText: 2026 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */
package org.microg.gms.gcm

import android.app.IntentService
import android.content.Intent

class PushRegisterProxy : IntentService(TAG) {

    @Deprecated("Deprecated in Java")
    override fun onHandleIntent(intent: Intent?) {
        intent?.setPackage(GMS_PACKAGE_NAME)
        startService(intent)
        stopSelf()
    }

    companion object {
        private const val TAG = "GsfGcmRegisterProxy"
        private const val GMS_PACKAGE_NAME = "com.google.android.gms"
    }
}
