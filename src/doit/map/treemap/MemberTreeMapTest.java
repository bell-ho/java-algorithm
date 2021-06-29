package doit.map.treemap;

import doit.collectionStudy.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap treeMap = new MemberTreeMap();

        Member m1 = new Member(100, "a");
        Member m2 = new Member(200, "b");
        Member m3 = new Member(300, "c");

        Member[] memArr = {m1, m2, m3};

        for (Member m : memArr) {
            treeMap.addMember(m);
        }

        treeMap.removeMember(100);
        treeMap.showAllMember();
    }
}
