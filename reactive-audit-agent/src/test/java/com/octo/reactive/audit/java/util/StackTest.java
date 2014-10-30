/*
 * Copyright 2014 OCTO Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.octo.reactive.audit.java.util;

import com.octo.reactive.audit.ReactiveAudit;
import com.octo.reactive.audit.TestTools;
import com.octo.reactive.audit.lib.ReactiveAuditException;
import org.junit.Test;

import java.util.Stack;

public class StackTest
{
	@Test(expected = ReactiveAuditException.class)
	public void pop()
	{
		ReactiveAudit.off.commit();
		Stack stack=new Stack();
		TestTools.strict.commit();
		stack.pop();
	}
	@Test(expected = ReactiveAuditException.class)
	public void peek()
	{
		ReactiveAudit.off.commit();
		Stack stack=new Stack();
		TestTools.strict.commit();
		stack.peek();
	}
	@Test(expected = ReactiveAuditException.class)
	public void search()
	{
		ReactiveAudit.off.commit();
		Stack stack=new Stack();
		TestTools.strict.commit();
		stack.search(null);
	}
}