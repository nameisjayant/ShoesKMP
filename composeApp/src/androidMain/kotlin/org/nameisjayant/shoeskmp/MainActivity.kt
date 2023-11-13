package org.nameisjayant.shoeskmp

import ShoesKMPApp
import android.os.Bundle
import androidx.core.view.WindowCompat
import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent
import org.nameisjayant.shoeskmp.theme.ShoesKMPTheme

class MainActivity : PreComposeActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ShoesKMPTheme {
                ShoesKMPApp()
            }
        }
    }
}
