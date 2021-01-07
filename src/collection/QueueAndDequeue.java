package collection;

import java.sql.*;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueAndDequeue {

    public static void main(String[] args) throws SQLException {

        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.add("hisham");
        priorityQueue.add("mohssine");
        priorityQueue.add("hisham");
        priorityQueue.add("soufiane");
        priorityQueue.add("karim");
        System.out.println("priorityQueue = " + priorityQueue);
        Object remove = priorityQueue.poll();
        System.out.println("remove = " + remove);


        ArrayDeque arrayDeque=new ArrayDeque();

        arrayDeque.add(13403);
        arrayDeque.add(263);
        arrayDeque.add(903);
        arrayDeque.add(13);
        arrayDeque.add(2453);

        Object pop = arrayDeque.pop();
        System.out.println("pop = " + pop);
        System.out.println("arrayDeque = " + arrayDeque);


        Connection connection= DriverManager.getConnection("url,username,password");
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from employees");


    }
}
