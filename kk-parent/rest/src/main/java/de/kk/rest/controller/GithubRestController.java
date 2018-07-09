package de.kk.rest.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonMappingException.Reference;

import de.kk.rest.model.TimelinePreview;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/github")
public class GithubRestController {

	@ApiOperation(value = "Get timeline preview list")
	@RequestMapping(method = RequestMethod.GET, value = "/timeline/getpreviews", produces = "application/json")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "languageCode", value = "User's language, if nothing passed return en", required = false, dataType = "string") })
	@ApiResponses(@ApiResponse(code = 500, message = "Failure"))
	public List<TimelinePreview> getTimelineList(@RequestParam final String languageCode) {
		// das muss gecached / persistiert werden
		// https://api.github.com/repos/kryptokrauts/kk-web-dev/issues?labels=timeline

		// wenn cache leer (alle schreibenden aktionen führen zum leeren des caches,
		// alternativ alle x min)
		// github call (siehe oben)
		// filtere nach übergebener Sprache
		// rufe alle markdown files / deren content ab - diese sind anhand des links
		// ermittelbar
		// anhand der meta-infos
		// sortiere Timeline beiträge

		// es wird die liste der PreviewTimline Beiträge geliefert
		// bei user-klick auf ein Preview erfolgt die Weiterleitung auf den
		// Detailartikel

		return new LinkedList<>();
	}

	@ApiOperation(value = "Get (coin) projects")
	@RequestMapping(method = RequestMethod.GET, value = "/projects/getall", produces = "application/json")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "url", value = "the url to the current displayed article, the current user language can be extracted from the url", required = false, dataType = "string") })
	@ApiResponses(@ApiResponse(code = 500, message = "Failure"))
	public Map<String,Reference> getMetadata(@RequestParam final String url) {
	
		// ein content besteht grundsätzlich aus 2 dateien
		// markdown mit Inhalt
		// metadata-json mit allen weiteren Informationen
		// liefert eine Liste mit Metadaten sortiert nach Anwendungstyp
		//bspw
		// {
			//"socialmedia": [{"name":"twitter","url":"https://twitter/project","description":"follow!"},{"name":"medium","url":"https://medium/project"}],
			//"blockexplorer": [{"name":"ethbalance.rocks"}]
		//}

		return new HashMap<>();
	}
}