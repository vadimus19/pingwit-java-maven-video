package com.pingwit.part_19.homework.task_2;

import com.pingwit.part_19.homework.task_1.Motorcycle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadMotorcycleFromFile {
    public static void main(String[] args) {
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
