package doit.hashset;

import doit.collectionStudy.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(1001, "이");
        Member member2 = new Member(1002, "박");
        Member member3 = new Member(1003, "최");
        Member member4 = new Member(1004, "홍");

        Member[] memArr = {member1, member2, member3, member4};

        for (int i = 0; i < memArr.length; i++) {
            memberTreeSet.addMember(memArr[i]);
        }
        memberTreeSet.showAllMember();

        Member m5 = new Member(1001, "홍");
        memberTreeSet.addMember(m5);
        memberTreeSet.showAllMember();

    }
}
