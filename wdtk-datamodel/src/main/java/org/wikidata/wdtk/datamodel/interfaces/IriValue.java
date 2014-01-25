package org.wikidata.wdtk.datamodel.interfaces;

/*
 * #%L
 * Wikidata Toolkit Data Model
 * %%
 * Copyright (C) 2014 Wikidata Toolkit Developers
 * %%
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
 * #L%
 */

/**
 * An IriValue is a Value that is identified by an IRI, which can be used as the
 * canonical identifier for the entity outside of the context of a particular
 * Wikibase installation.
 * 
 * @author Markus Kroetzsch
 * 
 */
public interface IriValue extends Value {

	/**
	 * Get the IRI of this entity.
	 * 
	 * @return String with the IRI
	 */
	public String getIri();
}
