package com.pingwit.part_19.homework.task_1;

import java.io.*;

public class WriteMotorcycleToFile {
    public static void main(String[] args) {
        Engine engine = new Engine(1200, "SN123456789");
        Motorcycle motorcycle = new Motorcycle("Honda", "Yakudza", engine);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/pingwit/part_19/homework/task_1/moto.txt"))) {
            oos.writeObject(motorcycle);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/pingwit/part_19/homework/task_1/moto.txt"))) {
            Motorcycle deserializedMotorcycle = (Motorcycle) ois.readObject();
            System.out.println(deserializedMotorcycle);
        } catch (FileNotFoundException e) { // опционально: я бы тебе предложил объединить 3 catch блока в 1 и внутри оставить throw new RuntimeException(e);
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
