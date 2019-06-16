package demo.com.ax.copy;


import org.junit.Assert;
import org.junit.Test;

import java.io.*;

/**
 * 这是一个深度克隆的案例
 */
public class DeepClone implements Serializable, Cloneable {


    public Object deepClone(Serializable o) throws IOException, ClassNotFoundException {

        //
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(o);

        //
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object object = objectInputStream.readObject();

        return object;
    }


    @Test
    public void cloneTest() {

        DeepClone deepClone = new DeepClone();
        try {

            CloneClass c = new CloneClass();
            c.setName("Hello");

            Cloneable o = (Cloneable) deepClone.deepClone(c);

            Assert.assertNotEquals(c, o);

            System.out.println(c == o);
            System.out.println(c.toString());
            System.out.println(o.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    class CloneClass implements Cloneable, Serializable {
        private static final long serialVersionUID = 1L;

        private String name;

        public long getSerialVersionUID() {
            return serialVersionUID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "CloneClass{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


}
