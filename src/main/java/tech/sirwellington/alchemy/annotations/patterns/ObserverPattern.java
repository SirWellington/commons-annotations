/*
 * Copyright 2015 Sir Wellington.
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
package tech.sirwellington.alchemy.annotations.patterns;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Target;

/**
 * Used to document the application and use of the Observer Pattern.
 *
 * @see
 * <a href="http://www.oodesign.com/observer-pattern.html">http://www.oodesign.com/observer-pattern.html</a>
 *
 * @author SirWellington
 */
@Documented
@Target(TYPE)
public @interface ObserverPattern
{

    Role role();

    public static enum Role
    {

        /**
         * Applied to the Object being observed by others. This is also known as the "Topic".
         */
        SUBJECT,
        /**
         * Applied to the Interface of the Observer interested in observing the Subject. This is
         * also known as a Listener, or Subscriber.
         */
        OBSERVER,
        /**
         * Applied to an Object that implements the Observer interface, i.e. a Concrete Observer.Ï
         */
        CONCRETE_OBSERVER,
        /**
         * In some implementations, there is a broker between the Subject and its observers that
         * manage state and connections.
         */
        BROKER
    }
}