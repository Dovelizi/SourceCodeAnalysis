/*
 * Copyright (C) 2009-2021 The Project Lombok Authors.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package lombok.transform;

import java.io.File;

import lombok.DirectoryRunner;

import org.junit.runner.RunWith;

@RunWith(DirectoryRunner.class)
public class TestSourceFiles extends DirectoryRunner.TestParams {
	@Override
	public DirectoryRunner.Compiler getCompiler() {
		return DirectoryRunner.Compiler.DELOMBOK;
	}
	
	@Override
	public boolean printErrors() {
		return true;
	}
	
	@Override
	public File getBeforeDirectory() {
		return new File("test/pretty/resource/before");
	}
	
	@Override
	public File getAfterDirectory() {
		return new File("test/pretty/resource/after");
	}
	
	@Override
	public File getMessagesDirectory() {
		return new File("test/pretty/resource/messages");
	}
	
	@Override
	public boolean expectChanges() {
		return false;
	}
	
	@Override public String testNamePrefix() {
		return "prettyprint-";
	}
}
