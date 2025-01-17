/*
 * Copyright (c) 2019 Broadcom.
 * The term "Broadcom" refers to Broadcom Inc. and/or its subsidiaries.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Broadcom, Inc. - initial API and implementation
 */
package com.ca.lsp.core.cobol.preprocessor.sub.document;

import com.ca.lsp.core.cobol.params.CobolParserParams;
import com.ca.lsp.core.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum;

public interface CobolDocumentParser {

  String processLines(String code, CobolSourceFormatEnum format, CobolParserParams params);
}
