package behavioral.pattern.observer;

import static behavioral.pattern.observer.Event.*;

public class MainApp {

    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("TestMail@observer.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("TestMail@observer.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("TestMail@observer.com"));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener("ObserverPattern"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener("TestMail@observer.com"));
        store.salePromotion();

    }

}