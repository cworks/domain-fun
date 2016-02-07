/**
 * ============================================================================
 * Project: domain-fun
 * Created: 2016-02-06 20:12:37
 * Class:   cworks.app.Application
 *
 * Baked with love
 * ============================================================================
 */
package cworks.app;

import org.junit.Test;
import org.junit.Assert;

public class TestApplication {

	@Test
	public void testAppName() throws Exception {
        Assert.assertEquals("TestApplication", this.getClass().getSimpleName());
	}

}
