package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;

import java.util.HashMap;
import java.util.Map;

public class WeatherChannel {

    HashMap<Client, Areas> subscribtions = new HashMap<>();

    public void addSubscribtion(Client client, Areas area) {
        this.subscribtions.put(client, area);
    }

    public void addArea(Client client, String area) {
        if (area.isEmpty()) {
            System.out.println("Area not provided");
        } else {
            if (subscribtions.containsKey(client)) {
                subscribtions.get(client).addArea(area);
            } else {
                subscribtions.put(client, new Areas(area));
            }
        }
    }

    public void sendAreaNotification(String area, Notification notification) {
        for (Map.Entry<Client, Areas> sub : subscribtions.entrySet()
        ) {
            if (sub.getValue().containsArea(area)) {
                sub.getKey().receive(notification);
            }
            ;
        }
    }

    public void sendNotificationToAll(Notification notification) {
        for (Client sub : subscribtions.keySet()) {
            sub.receive(notification);
        }
    }
}
