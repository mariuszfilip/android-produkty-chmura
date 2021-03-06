/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-11-17 18:43:33 UTC)
 * on 2015-01-17 at 15:20:38 UTC 
 * Modify at your own risk.
 */

package com.example.produkty2.produktyendpoint.model;

/**
 * Model definition for Produkty.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the produktyendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Produkty extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cena;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iloscproduktow;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nazwa;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCena() {
    return cena;
  }

  /**
   * @param cena cena or {@code null} for none
   */
  public Produkty setCena(java.lang.String cena) {
    this.cena = cena;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Produkty setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIloscproduktow() {
    return iloscproduktow;
  }

  /**
   * @param iloscproduktow iloscproduktow or {@code null} for none
   */
  public Produkty setIloscproduktow(java.lang.String iloscproduktow) {
    this.iloscproduktow = iloscproduktow;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNazwa() {
    return nazwa;
  }

  /**
   * @param nazwa nazwa or {@code null} for none
   */
  public Produkty setNazwa(java.lang.String nazwa) {
    this.nazwa = nazwa;
    return this;
  }

  @Override
  public Produkty set(String fieldName, Object value) {
    return (Produkty) super.set(fieldName, value);
  }

  @Override
  public Produkty clone() {
    return (Produkty) super.clone();
  }

}
