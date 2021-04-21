package org.sunwoda.zset;

import redis.clients.jedis.Jedis;

/**
 * Description:
 *
 * @author shiguorang
 * @date 2021-04-21 15:02:32
 */
public class ZsetTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.zadd("zsets", 10, "shiguorang");

        jedis.close();
    }
}
