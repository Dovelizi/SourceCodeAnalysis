/*
 * Copyright 2002-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.context;

import java.util.EventListener;
import java.util.function.Consumer;

/**
 * Interface to be implemented by application event listeners.
 * 被应用程序监听器实现的接口
 *
 * <p>Based on the standard {@code java.util.EventListener} interface
 * for the Observer design pattern.
 * 基于标准的 EventListener 接口实现的观察者模式
 *
 * <p>As of Spring 3.0, an {@code ApplicationListener} can generically declare
 * the event type that it is interested in. When registered with a Spring
 * {@code ApplicationContext}, events will be filtered accordingly, with the
 * listener getting invoked for matching event objects only.
 * ApplicationListener能够声明它感兴趣的事件类型，当一个ApplicationContext被注册时，
 * 事件将会被过滤，监听器只会调用匹配的事件
 * 该接口充当观察者模式中的抽象观察者（Observer）
 * 它是一个抽象类或接口，包含了一个更新自己的抽象方法，当接到具体主题的更改通知（具体事件）时被调用
 *
 * @author Rod Johnson
 * @author Juergen Hoeller
 * @param <E> the specific {@code ApplicationEvent} subclass to listen to
 * @see org.springframework.context.ApplicationEvent
 * @see org.springframework.context.event.ApplicationEventMulticaster
 * @see org.springframework.context.event.SmartApplicationListener
 * @see org.springframework.context.event.GenericApplicationListener
 * @see org.springframework.context.event.EventListener
 */
@FunctionalInterface
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

	/**
	 * Handle an application event.
	 * @param event the event to respond to
	 */
	void onApplicationEvent(E event);


	/**
	 * Create a new {@code ApplicationListener} for the given payload consumer.
	 * @param consumer the event payload consumer
	 * @param <T> the type of the event payload
	 * @return a corresponding {@code ApplicationListener} instance
	 * @since 5.3
	 * @see PayloadApplicationEvent
	 */
	static <T> ApplicationListener<PayloadApplicationEvent<T>> forPayload(Consumer<T> consumer) {
		return event -> consumer.accept(event.getPayload());
	}

}
