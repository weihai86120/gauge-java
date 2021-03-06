// Copyright 2015 ThoughtWorks, Inc.

// This file is part of Gauge-Java.

// This program is free software.
//
// It is dual-licensed under:
// 1) the GNU General Public License as published by the Free Software Foundation,
// either version 3 of the License, or (at your option) any later version;
// or
// 2) the Eclipse Public License v1.0.
//
// You can redistribute it and/or modify it under the terms of either license.
// We would then provide copied of each license in a separate .txt file with the name of the license as the title of the file.

package com.thoughtworks.gauge;

public class GaugeConstant {
    public static final String SCREENSHOT_ON_FAILURE_ENABLED = "screenshot_on_failure";
    public static final String PACKAGE_TO_SCAN = "package_to_scan";
    public static final String GAUGE_PROJECT_ROOT = "GAUGE_PROJECT_ROOT";
    public static final String GAUGE_CUSTOM_COMPILE_DIR = "gauge_custom_compile_dir";
    public static final String DEFAULT_SRC_DIR = "src/test/java";
    public static final String[] DEFAULT_SRC_DIRS = {"src/main/java", DEFAULT_SRC_DIR};
    public static final String SCREENSHOTS_DIR_ENV = "gauge_screenshots_dir";
    public static final String STREAMS_COUNT_ENV = "GAUGE_PARALLEL_STREAMS_COUNT";
}
