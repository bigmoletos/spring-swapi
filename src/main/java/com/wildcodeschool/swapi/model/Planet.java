package com.wildcodeschool.swapi.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {
//	 "name": "Tatooine", 
//	    "rotation_period": "23", 
//	    "orbital_period": "304", 
//	    "diameter": "10465", 
//	    "climate": "arid", 
//	    "gravity": "1 standard", 
//	    "terrain": "desert", 
//	    "surface_water": "1", 
//	    "population": "200000", 
//	    "residents": [] "https://swapi.co/api/people/1/", 
//	    "films":   []     "https://swapi.co/api/films/5/", 
//	    "created": "2014-12-09T13:50:49.641000Z", 
//	    "edited": "2014-12-21T20:48:04.175778Z", 
//	    "url": "https://swapi.co/api/planets/1/"

//	private String name;
//	private String rotation_period;
//	private String mass;
//	@JsonProperty("hair_color")
//	private String hairColor;
//	@JsonProperty("skin_color")
//	private String skinColor;
//	@JsonProperty("eye_color")
//	private String eyeColor;
//	@JsonProperty("birth_year")
//	private String birthYear;
//	private String gender;
//	private String homeworld;
//	private String[] films;
//	private String[] species;
//	private String[] vehicles;
//	private String[] starships;
//	private String created;
//	private String edited;
//	private String url;

	private String name;
	@JsonProperty("rotation_period")
	private String rotationPeriod;
	@JsonProperty("orbital_period")
	private String orbitalPeriod;
	private String diameter;
	private String climate;
	private String gravity;
	private String terrain;
	@JsonProperty("surface_water")
	private String surfaceWater;
	private String population;
	private String[] residents;
	private String[] films;
	private LocalDate created;
	private LocalDate edited;
	private String url;

	// TODO : add an empty constructor
	private void planet() {

	}
	// TODO : add getters and setters

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rotationPeriod
	 */
	public String getRotationPeriod() {
		return this.rotationPeriod;
	}

	/**
	 * @param rotationPeriod the rotationPeriod to set
	 */
	public void setRotationPeriod(String rotationPeriod) {
		this.rotationPeriod = rotationPeriod;
	}

	/**
	 * @return the orbitalPeriod
	 */
	public String getOrbitalPeriod() {
		return this.orbitalPeriod;
	}

	/**
	 * @param orbitalPeriod the orbitalPeriod to set
	 */
	public void setOrbitalPeriod(String orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}

	/**
	 * @return the diameter
	 */
	public String getDiameter() {
		return this.diameter;
	}

	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	/**
	 * @return the climate
	 */
	public String getClimate() {
		return this.climate;
	}

	/**
	 * @param climate the climate to set
	 */
	public void setClimate(String climate) {
		this.climate = climate;
	}

	/**
	 * @return the gravity
	 */
	public String getGravity() {
		return this.gravity;
	}

	/**
	 * @param gravity the gravity to set
	 */
	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	/**
	 * @return the terrain
	 */
	public String getTerrain() {
		return this.terrain;
	}

	/**
	 * @param terrain the terrain to set
	 */
	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	/**
	 * @return the surfaceWater
	 */
	public String getSurfaceWater() {
		return this.surfaceWater;
	}

	/**
	 * @param surfaceWater the surfaceWater to set
	 */
	public void setSurfaceWater(String surfaceWater) {
		this.surfaceWater = surfaceWater;
	}

	/**
	 * @return the population
	 */
	public String getPopulation() {
		return this.population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(String population) {
		this.population = population;
	}

	/**
	 * @return the residents
	 */
	public String[] getResidents() {
		return this.residents;
	}

	/**
	 * @param residents the residents to set
	 */
	public void setResidents(String[] residents) {
		this.residents = residents;
	}

	/**
	 * @return the films
	 */
	public String[] getFilms() {
		return this.films;
	}

	/**
	 * @param films the films to set
	 */
	public void setFilms(String[] films) {
		this.films = films;
	}

	/**
	 * @return the created
	 */
	public LocalDate getCreated() {
		return this.created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(LocalDate created) {
		this.created = created;
	}

	/**
	 * @return the edited
	 */
	public LocalDate getEdited() {
		return this.edited;
	}

	/**
	 * @param edited the edited to set
	 */
	public void setEdited(LocalDate edited) {
		this.edited = edited;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
