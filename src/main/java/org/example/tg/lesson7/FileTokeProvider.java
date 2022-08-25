package org.example.tg.lesson7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Logger;

public class FileTokeProvider implements TokenProvider {

  private static final Logger logger = Logger.getLogger(FileTokeProvider.class.getName());
  private final Path path;

  public FileTokeProvider(String path) {
    this.path = Path.of(path);
  }

  @Override
  public String get() {
    try {
      return Files.readString(path);
    } catch (IOException e) {
      logger.info(e.getMessage());
    }

    return null;
  }
}
