package org.demo.cdc;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.yb.cdc.schema.Table;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class CdcConsumer {

    @Incoming("users_cdc")
    public void receive(Table usrsTblRec) {
        if (usrsTblRec != null)
          log.info("CDC stream coming IN!! - " + usrsTblRec.getName());
        else System.out.println("Empty Message!");

    }

}