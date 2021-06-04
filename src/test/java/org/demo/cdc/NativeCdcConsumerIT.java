package org.demo.cdc;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeCdcConsumerIT extends CdcConsumerTest {

    // Execute the same tests but in native mode.
}