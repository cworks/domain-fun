package cworks.app.domain;


import cworks.app.sys.SysApp;
import cworks.app.sys.SysKey;
import org.junit.Assert;
import org.junit.Test;

/**
 * A Identity is just that a unique identity.  Every Identity
 * will be unique using the default Identity implementation.  So by
 * design the getId() is designed to be unique.  Thus if you want to
 * implement your own Identity you're free to do so, just so long
 * as its unique.
 *
 * A Key by contrast is not in and of itself an Identity.  Its certainly
 * true that a Key could be unique and thus an Identity but its not
 * required to do so.  So a Key is not an Identity but an Object can
 * have multiple Keys.
 *
 *
 */
public class TestApp {

    public void testCreateApp() {

        App app = new SysApp();

        app.getId();
        app.getKey();

        app.getKey().getName();
        app.getKey().value();
        app.getKey().value(0);
        app.getKey().value(1);
        app.getKey().value(2);


        // should print field1, field2, field3
        System.out.println(app.getId());
        System.out.printf("");

        app.getName();
        app.getUrl();
        app.getScreens();
    }


    @Test
    public void testUnique() {
        SysKey app1 = new SysKey(100L);
        SysKey app2 = new SysKey(100L);
        Assert.assertTrue(app1.equals(app2));
    }

    @Test
    public void testNotEqual() {
        SysKey app1 = new SysKey(100L);
        SysKey app2 = new SysKey(200L);
        Assert.assertFalse(app1.equals(app2));
    }

    @Test
    public void testMultiKey() {
        SysKey multi1 = new SysKey("app","name");
        SysKey multi2 = new SysKey("app","name");
        Assert.assertTrue(multi1.equals(multi2));

        SysKey multi3 = new SysKey("app","url");
        Assert.assertFalse(multi1.equals(multi3));


    }



}
