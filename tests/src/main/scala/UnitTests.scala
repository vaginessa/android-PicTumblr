package net.tokyoenvious.droid.pictumblr.tests

import junit.framework.Assert._
import _root_.android.test.AndroidTestCase

import net.tokyoenvious.droid.pictumblr.Tumblr

class UnitTests extends AndroidTestCase {

    def testPackageIsCorrect {
        assertEquals("net.tokyoenvious.droid.pictumblr", getContext.getPackageName)
    }
}
