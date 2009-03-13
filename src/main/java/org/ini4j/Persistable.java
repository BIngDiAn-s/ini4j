/*
 * Copyright 2005,2009 Ivan SZKIBA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ini4j;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import java.net.URL;

interface Persistable
{
    File getFile();

    void setFile(File value);

    void load() throws IOException, InvalidIniFormatException;

    void load(InputStream input) throws IOException, InvalidIniFormatException;

    void load(Reader input) throws IOException, InvalidIniFormatException;

    void load(File input) throws IOException, InvalidIniFormatException;

    void load(URL input) throws IOException, InvalidIniFormatException;

    void store() throws IOException;

    void store(OutputStream output) throws IOException;

    void store(Writer output) throws IOException;

    void store(File output) throws IOException;
}
