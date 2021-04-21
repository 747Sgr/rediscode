package org.sunwoda.set;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Description:
 *
 * @author shiguorang
 * @date 2021-04-21 14:57:46
 */
public class SetTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.sadd("settest", "ming", "mlxg", "uzi", "13");
        Set<String> settest = jedis.smembers("settest");
        for (String s : settest) {
            System.out.println(s);
        }
        jedis.close();
    }
}
