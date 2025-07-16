package com.fnkcode.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


public class Lec05ImmutableRecord {

    private static final Logger log = LoggerFactory.getLogger(Lec05ImmutableRecord.class);

    record Team(String name,
                List<String> members){

        Team{
            //defensive copy
            members= List.copyOf(members); //transform the list into a immutable one because String is immutable
            //if instead of String we had an object --> the record could still be immutable if that object is not immutable
        }
    }


    public static void main(String[] args) {
        var members = new ArrayList<String>();
        members.add("John");
        members.add("Mike");

        var team = new Team("dev team", members);

        log.info("{}", team);
    }
}
