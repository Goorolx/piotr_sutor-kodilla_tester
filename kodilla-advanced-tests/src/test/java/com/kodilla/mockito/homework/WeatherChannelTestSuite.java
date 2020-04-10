package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherChannelTestSuite {

    @Test
    public void shouldAdd2NewClientSubscription() {
        WeatherChannel wc = new WeatherChannel();
        Client c1 = Mockito.mock(Client.class);
        Client c2 = Mockito.mock(Client.class);
        wc.addSubscribtion(c1, new Areas("Białka", "Podczerwone"));
        wc.addSubscribtion(c2, new Areas("Ba", "Po"));

        assertEquals(2, wc.subscribtions.size());
    }

    @Test
    public void shouldAddNewArea() {
        WeatherChannel wc = new WeatherChannel();
        Client c1 = Mockito.mock(Client.class);
        wc.addSubscribtion(c1, new Areas("A", "B", "C", "D"));
        wc.addArea(c1, "E");

        int a = wc.subscribtions.get(c1).getAreas().size();
        System.out.println(a);

        assertEquals(5, a);
    }
    @Test
    public void shouldNOTAddNewAreaWhenEmpty() {
        WeatherChannel wc = new WeatherChannel();
        Client c1 = Mockito.mock(Client.class);
        wc.addSubscribtion(c1, new Areas("A", "B", "C", "D"));
        wc.addArea(c1, "");

        int a = wc.subscribtions.get(c1).getAreas().size();
        System.out.println(a);

        assertEquals(4, a);
    }
    @Test
    public void notSubscribedClientShouldNotReceiveAreaNotification() {
        WeatherChannel weatherChannel = new WeatherChannel();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        weatherChannel.addSubscribtion(client, new Areas("B", "C"));

        weatherChannel.sendAreaNotification("A", notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
    @Test
    public void SubscribedClientShouldNotReceiveIncorrectNotificationAreaWeather() {
        WeatherChannel weatherChannel = new WeatherChannel();
        Client client = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        weatherChannel.addSubscribtion(client, new Areas("B", "C"));
        weatherChannel.addSubscribtion(client2, new Areas("A", "B", "C"));

        weatherChannel.sendAreaNotification("A", notification);
        weatherChannel.sendAreaNotification("Z", notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
    }
    @Test
    public void SubscribedClientShouldReceiveCorrectNotificationsAreaWeather() {
        WeatherChannel weatherChannel = new WeatherChannel();
        Client client = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        weatherChannel.addSubscribtion(client, new Areas("B", "C"));
        weatherChannel.addSubscribtion(client2, new Areas("A", "B", "C"));

        weatherChannel.sendAreaNotification("A", notification);
        weatherChannel.sendAreaNotification("B", notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(2)).receive(notification);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveNotificationsToAll() {
        WeatherChannel weatherChannel = new WeatherChannel();
        Client client = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        weatherChannel.addSubscribtion(client, new Areas("A", "B", "C"));

        weatherChannel.sendNotificationToAll(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2,Mockito.never()).receive(notification);
    }

    @Test
    public void allSubscribedClientsShouldReceiveNotificationToAll() {
        WeatherChannel weatherChannel = new WeatherChannel();
        Client client = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        weatherChannel.addSubscribtion(client, new Areas("X", "Y", "Z"));
        weatherChannel.addSubscribtion(client2, new Areas("A", "B", "C"));
        weatherChannel.addSubscribtion(client3, new Areas("F", "G"));

        weatherChannel.sendNotificationToAll(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
    }

}