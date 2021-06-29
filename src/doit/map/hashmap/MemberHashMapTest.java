package doit.map.hashmap;

import doit.collectionStudy.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member m1 = new Member(100, "a");
        Member m2 = new Member(200, "b");
        Member m3 = new Member(300, "c");

        Member[] memArr = {m1, m2, m3};

        for (Member m : memArr) {
            memberHashMap.addMember(m);
        }

        memberHashMap.showAllMember();
        memberHashMap.removeMember(100);

        memberHashMap.showAllMember();
    }
}
