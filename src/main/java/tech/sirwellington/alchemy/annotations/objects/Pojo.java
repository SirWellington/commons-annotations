/*
 * Copyright 2016 SirWellington Tech.
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

 
package tech.sirwellington.alchemy.annotations.objects;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;



/**
 * Describes an Object which is designed only to hold Objects.
 * In some circles this is known as a Java Bean.
 * The idea is that only {@code getters/setters/toString()/equals()/hashCode()} are provided.
 * @author SirWellington
 */
@Documented
@Retention(CLASS)
@Target(TYPE)
public @interface Pojo 
{

}
