package com.wildcodeschool.swapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {
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
	private String created;
	private String edited;
	private String url;

	// TODO : add an empty constructor
	public void planet() {

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
	public String getCreated() {
		return this.created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * @return the edited
	 */
	public String getEdited() {
		return this.edited;
	}

	/**
	 * @param edited the edited to set
	 */
	public void setEdited(String edited) {
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
