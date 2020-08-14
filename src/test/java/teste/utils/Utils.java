package teste.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import teste.setup.Hooks;

public class Utils {
public static void aguardar_elemento(int timeout, WebElement elemento) { 
		
		WebDriverWait aguardar = new WebDriverWait(Hooks.getDriver(), timeout);
		aguardar.until(ExpectedConditions.visibilityOf(elemento));		
	}
	
	public static boolean elemento_existe(WebElement elemento, int timeout) { 
		
		try {
			aguardar_elemento(timeout, elemento);
			
			return true;
			
		} catch (Exception e) {
			return false;
		}		
	}
	
	public static void elementoClicavel(WebElement elemento, int timeout) {
		WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), timeout);
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
		
	}

	}


