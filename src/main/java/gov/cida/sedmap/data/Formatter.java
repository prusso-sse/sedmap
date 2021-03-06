package gov.cida.sedmap.data;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import gov.cida.sedmap.data.HeaderType;

public interface Formatter {
	String getContentType();
	String fileHeader(List<Column> columns) throws SQLException;

	String fileHeader(Iterator<String> columns, HeaderType headerType) throws SQLException;
	String fileHeader(HeaderType headerType) throws SQLException;
	String fileRow(Iterator<String> values) throws SQLException;
	//	String fileHeader(Iterator<String> columns) throws SQLException;
	//	String fileRow(Iterator<Object> data) throws SQLException;
	String getFileType();
	String getSeparator();
	String getType();
	String transform(String line, Formatter from);
}
