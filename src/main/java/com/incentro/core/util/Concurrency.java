package main.java.com.incentro.core.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Arne Staphorsius.
 * @since 17-2-2016.
 */
public class Concurrency {

  private static ExecutorService exe;

  static {
    exe = Executors.newFixedThreadPool(3);
  }

  public static void run(final Runnable runnable) {

    if (runnable != null) {

      exe.execute(runnable);
    }
  }
}
