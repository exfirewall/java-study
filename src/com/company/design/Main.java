package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.SftpClient;
import com.company.design.facade.Writer;
import com.company.design.observer.Button;
import com.company.design.observer.iButtonListener;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.iBrowser;
import com.company.design.singleton.Aclazz;
import com.company.design.singleton.BClazz;
import com.company.design.strategy.Base64Strategy;
import com.company.design.strategy.Encoder;
import com.company.design.strategy.EncodingStrategy;
import com.company.design.strategy.NormalStrategy;

import javax.swing.text.DefaultEditorKit;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
//        Aclazz aclazz = new Aclazz();
//        BClazz bClazz = new BClazz();
//
//        SocketClient aClient = aclazz.getSocketClient();
//        SocketClient bClient = bClazz.getSocketClient();
//
//        System.out.println("객체가 동일한가?");
//        System.out.println(aClient.equals(bClient));

//        HairDryer hairDryer = new HairDryer();
//        connect(hairDryer);
//
//        Cleaner cleaner = new Cleaner();
//        Electronic110v CleanerAdapter = new SocketAdapter(cleaner);
//        connect(CleanerAdapter);
//        AirConditioner airConditioner = new AirConditioner();
//        Electronic110v AirAdapter = new SocketAdapter(airConditioner);
//        connect(AirAdapter);

//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//
//        BrowserProxy browser2 = new BrowserProxy("www.naver.com");
//        browser2.show();
//        browser2.show();
//        browser2.show();
//        browser2.show();

//        AtomicLong start = new AtomicLong();
//        AtomicLong end = new AtomicLong();
//
//        iBrowser aopBrowser = new AopBrowser("www.naver.com",
//                ()->{
//                    System.out.println("before");
//                    start.set(System.currentTimeMillis());
//                },
//                ()->{
//                    long now = System.currentTimeMillis();
//                    end.set(now - start.get());
//                }
//                );
//
//        aopBrowser.show();
//        System.out.println("loading time : " + end.get());
//
//        aopBrowser.show();
//        System.out.println("loading time : " + end.get());

//        Icar audi = new Audi(1000);
//        audi.showPrice();
//
//        // a3
//        Icar audi3 = new A3(audi, "A3");
//        audi3.showPrice();
//        // a4
//        Icar audi4 = new A4(audi, "A4");
//        audi4.showPrice();
//        // a5
//        Icar audi5 = new A5(audi, "A5");
//        audi5.showPrice();

//        Button button = new Button("버튼");
//
//        button.addListener(new iButtonListener() {
//            @Override
//            public void clickEvent(String event) {
//                System.out.println(event);
//            }
//        });
//
//        button.click("메시지 전달 : click 1");
//        button.click("메시지 전달 : click 2");
//        button.click("메시지 전달 : click 3");
//        button.click("메시지 전달 : click 4");

//        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        ftpClient.disconnect();
//        writer.fileDisconnect();
//        reader.fileDisconnect();
//
//        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
//        sftpClient.connect();
//        sftpClient.write();
//        sftpClient.read();
//        sftpClient.disConnect();
        Encoder encoder = new Encoder();

        // base64
        EncodingStrategy base64 = new Base64Strategy();
        // normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessgae(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessgae(message);
        System.out.println(normalResult);
    }

    //콘센트
    public static void connect(Electronic110v electronic110v){
        electronic110v.powerOn();
    }
}
