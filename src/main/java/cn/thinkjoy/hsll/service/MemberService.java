package cn.thinkjoy.hsll.service;

import cn.thinkjoy.hsll.bean.Member;

/**
 * Created by warden on 17/7/22.
 */
public interface MemberService {


    Member getMemberByOpenId(String openId);

    Member getMemberByInviteCode(String inviteCode);

    Member getMemberById(long buyMemberId);

    void insertData(Member memberNew);
}
