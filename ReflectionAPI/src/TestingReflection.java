import java.lang.reflect.*;

/**
 * Created by wenbinli on 3/24/17.
 * this class is used to test reflection API
 */
public class TestingReflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class reflectClass = UFOEnemyShip.class;

        String className = reflectClass.getName();
        System.out.println("Class name is: " + className);

        /**
         * isAbstract, isFianl, isInterface, isPrivate, isProtected,
         * isStatic, isStrict, isSynchronized, isVolatile
         * */
        int classModifier = reflectClass.getModifiers();
        System.out.println("Modifier of is class is public: " + Modifier.isPublic(classModifier));

        Class[] interfaces = reflectClass.getInterfaces();

        Class classSuper = reflectClass.getSuperclass();
        System.out.println("Super class for this class is: " + classSuper.getName() + "\n");

        // loop all the methods
        Method[] classMethods = reflectClass.getMethods();

        for (Method method : classMethods) {
            System.out.println("Method Name: " + method.getName());
            if (method.getName().startsWith("get")) {
                System.out.println("Getter Method");
            } else if (method.getName().startsWith("set")) {
                System.out.println("Setter Method");
            }
            System.out.println("return Type: " + method.getReturnType());
            Class[] parameterType = method.getParameterTypes();
            System.out.println("Parameters");
            for (Class parameter : parameterType) {
                System.out.println(parameter.getName());
            }
            System.out.println();
        }

        Constructor constructor = null;
        Object construtor2 = null;
        try {
            constructor = reflectClass.getConstructor(new Class[]{EnemyShipFactory.class});
            construtor2 = reflectClass.getConstructor(int.class, String.class).newInstance(12, "Random String");
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Class[] constructParameters = constructor.getParameterTypes();
        for (Class parameter : constructParameters) {
            System.out.println(parameter.getName());
        }

        UFOEnemyShip newEnemyShip = null;
        EnemyShipFactory shipFactory = null;
        try {
            newEnemyShip = (UFOEnemyShip) constructor.newInstance(shipFactory);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        newEnemyShip.setName("XT-100");
        System.out.println("Enemy Ship Name: " + newEnemyShip.getName());

        // get private field
        Field privateStringName = null;
        UFOEnemyShip enemyShipPrivate = new UFOEnemyShip(shipFactory);
        try {
            String idCodeString = "idCode";
            privateStringName = UFOEnemyShip.class.getDeclaredField(idCodeString);
            privateStringName.setAccessible(true);

            String valueOfName = (String) privateStringName.get(enemyShipPrivate);
            System.out.println("Private field name: " + valueOfName);

            String methodName = "getPrivate";
            Method privateMethod = UFOEnemyShip.class.getDeclaredMethod(methodName, null);

            privateMethod.setAccessible(true);
            String privateReturnVal = (String) privateMethod.invoke(enemyShipPrivate, null);
            System.out.println("Enemy Ship Private method: " + privateReturnVal);

            // private method with parameters
            Class[] methodParameters = new Class[]{Integer.TYPE, String.class};
            Object[] params = new Object[] {new Integer(10), new String("Random")};
            privateMethod = UFOEnemyShip.class.getDeclaredMethod("getOtherPrivate", methodParameters);//("getOtherPrivate", int.class, String.class)
            privateMethod.setAccessible(true);
            privateReturnVal = (String) privateMethod.invoke(enemyShipPrivate, params);
            System.out.println("Enemy Ship Other Private Method: " + privateReturnVal);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
