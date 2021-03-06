package decompiler;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static utils.TestUtils.routine;

public class TraitsTest {

    private static final String packageName = "traits";

    @Test
    public void testEmptyTrait() throws IOException {
        routine("EmptyTrait", packageName);
    }

    @Test
    public void testOneFuncTrait() throws IOException {
        routine("OneFuncTrait", packageName);
    }

    @Test
    public void testFullTrait() throws IOException {
        routine("FullTrait", packageName);
    }

    @Test
    @Ignore("only for debug")
    public void testFullTraitHelper() throws IOException {
        routine("FullTrait$Trait$Helper", packageName);
    }

    @Test
    @Ignore("only for debug")
    public void testFullTraitFieldHelper() throws IOException {
        routine("FullTrait$Trait$FieldHelper", packageName);
    }

    @Test
    public void testGenericTrait() throws IOException {
        routine("GenericTrait", packageName);
    }

    @Test
    @Ignore("only for debug")
    public void testtGenericTraitFieldHelper() throws IOException {
        routine("GenericTrait$Trait$FieldHelper", packageName);
    }

    @Test
    public void testStaticTrait() throws IOException {
        routine("StaticTrait", packageName);
    }

    @Test
    @Ignore("only for debug")
    public void testStaticTraitHelper() throws IOException {
        routine("StaticTrait$Trait$Helper", packageName);
    }

    @Test
    @Ignore("only for debug")
    public void testStaticTraitFieldHelper() throws IOException {
        routine("StaticTrait$Trait$FieldHelper", packageName);
    }
}
