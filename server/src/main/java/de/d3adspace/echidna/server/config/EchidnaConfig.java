/*
 * Copyright (c) 2017 - 2019 D3adspace
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.d3adspace.echidna.server.config;

import java.util.List;

/**
 * @author Felix Klauke (info@felix-klauke.de)
 */
public class EchidnaConfig {

  private final String serverHost;
  private final int serverPort;
  private final List<Object> resources;

  public EchidnaConfig(String serverHost, int serverPort,
      List<Object> resources) {
    this.serverHost = serverHost;
    this.serverPort = serverPort;
    this.resources = resources;
  }

  public String getServerHost() {
    return serverHost;
  }

  public int getServerPort() {
    return serverPort;
  }

  public List<Object> getResourceClasses() {
    return resources;
  }
}