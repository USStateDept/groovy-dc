package decompiler.visitors;

import org.objectweb.asm.Type;

public class AbstractParser {
    public static final String DEF = "def";

    private static String[] simpleTypeNames = {
            "void",
            "boolean",
            "char",
            "byte",
            "short",
            "int",
            "float",
            "long",
            "double",
            "array",
            "Object"
    };

    protected StringBuilder parseInterfaceField(int access, String name, String desc, String signature, Object value) {
        StringBuilder sb = new StringBuilder();
        sb
                .append(parseType(desc, signature))
                .append(' ')
                .append(name)
                .append('\n');
        return sb;
    }

    protected StringBuilder parseValue(Object value) {
        StringBuilder sb = new StringBuilder();
        if (value == null) {
            return sb;
        }
        return sb.append(value);
    }

    protected StringBuilder parseType(String desc, String signature) {
        StringBuilder sb = new StringBuilder();

        if (signature != null) {
            //TODO <generic> magic
        } else {
            Type t = Type.getType(desc);
            if (desc.length() > 1) {
                sb.append(parseObjName(t));
            } else {
                sb.append(t.getClassName());
            }

        }
        return sb;
    }

    private StringBuilder parseObjName(Type type) {
        StringBuilder sb = new StringBuilder();
        if (type.getClassName().equals("java.lang.Object")){
            sb.append(DEF);
        } else {
            sb.append(type.getClassName());
        }
        return sb;
    }
}
