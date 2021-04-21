package org.sunwoda.list;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Description:
 *
 * @author shiguorang
 * @date 2021-04-21 14:52:53
 */
public class ListTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.lpush("name", "shiguorang", "age", "15", "sex", "男");
        List<String> name = jedis.lrange("name", 0, -1);
        for (String s : name) {
            System.out.println(s);
        }
        jedis.close();
    }
}
