import java.lang.reflect.Field;
public class PrintAttributes {
    public static void printAttributes(Object obj) {
        System.out.println("Attributes of the object:");
        Class<?> objClass = obj.getClass();
        Field[] fields = objClass.getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true); // This line allows to access private fields
                Object value = field.get(obj);
                System.out.println(field.getName() + ": " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
